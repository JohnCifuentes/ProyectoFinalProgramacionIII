package uq.app.jacm.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private File file;
	
	public FileManager(String path) throws IOException  {
		this.file = new File(path);
		File directoryFile = this.file.getParentFile();
		if(!directoryFile.exists())
			directoryFile.mkdirs();
	}


	public ArrayList<String> listFilesFromDirectory() throws IOException {
		FileReader fileReader = new FileReader(this.file);
		BufferedReader bufferRead= new BufferedReader(fileReader);
		ArrayList<String> records = new ArrayList<>();
		String r;
		while((r = bufferRead.readLine()) != null) {
			records.add(r);
		}
		bufferRead.close();
		fileReader.close();
		return records;
	}

	public void writeToFile(String data) throws IOException {
		FileWriter fileWriter = new FileWriter(this.file, false);
		BufferedWriter bufferWrite = new BufferedWriter(fileWriter);
		bufferWrite.write(data);
		bufferWrite.flush();
		bufferWrite.close();
		fileWriter.close();
	}

	public void writeToFile(ArrayList<String> data) throws IOException {
		FileWriter fileWriter = new FileWriter(this.file, false);
		BufferedWriter bufferWrite = new BufferedWriter(fileWriter);
		for(String d: data) 
			bufferWrite.write(d);
		bufferWrite.flush();
		bufferWrite.close();
		fileWriter.close();		
	}

}