package readTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadTable {
	private static final String fileName = "C:/Users/TS12/Desktop/worspaceJava/table/tabelasExcell/alunos.xls";

	public static void main(String[] args) throws IOException {

		List<Aluno> listaAlunos = new ArrayList<Aluno>();

		try {
			FileInputStream arquivo = new FileInputStream(new File(ReadTable.fileName));

			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

			HSSFSheet sheetAlunos = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetAlunos.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				Aluno aluno = new Aluno();
				listaAlunos.add(aluno);
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						aluno.setNome(cell.getStringCellValue());
						break;
					case 1:
						aluno.setRa(String.valueOf(cell.getStringCellValue()));
						break;
					case 2:
						aluno.setNota1(cell.getNumericCellValue());
						break;
					case 3:
						aluno.setNota2(cell.getNumericCellValue());
						break;
					case 4:
						aluno.setMedia(cell.getNumericCellValue());
						break;
					case 5:
						aluno.setAprovado(cell.getBooleanCellValue());
						break;
					}
				}
			}
			arquivo.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		}

		if (listaAlunos.size() == 0) {
			System.out.println("Nenhum aluno encontrado!");
		} else {
			double soma = 0;
			double maior = 0;
			double menor = listaAlunos.get(0).getMedia();
			int aprovados = 0;
			int reprovados = 0;
			for (Aluno aluno : listaAlunos) {
				System.out.println("Aluno: " + aluno.getNome() + " -  Média: " + aluno.getMedia());
				soma = soma + aluno.getMedia();
				if (aluno.getMedia() > maior) {
					maior = aluno.getMedia();
				}
				if (aluno.getMedia() < menor) {
					menor = aluno.getMedia();
				}
				if (aluno.getMedia() >= 6) {
					aprovados++;
				}
				if (aluno.getMedia() < 6) {
					reprovados++;
				}
			}
			double media = soma / listaAlunos.size();
			

			System.out.printf("\nA média de notas é: %.2f\n",  media);
			System.out.println("A maior nota é: " + maior  );
			System.out.println("A menor nota é: " + menor);
			System.out.println("O numero de alunos aprovados é: " + aprovados);
			System.out.println("O numero de alunos reprovados é: " + reprovados);
			System.out.println("\nNúmero total de alunos: " + listaAlunos.size());
		}

	}

}
