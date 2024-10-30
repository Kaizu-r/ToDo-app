package task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Task {
	public ArrayList<Byte> category = new ArrayList<Byte>();
	public String name = "";
	public String description = "";
	public byte[] duration = new byte[3];
	//declaration 
	public LocalDate duedate;
	public LocalTime dueTime;
	
	Task(ArrayList<Byte> category, String name, String description, byte[] duration, LocalDate duedate, LocalTime dueTine) {
		
	}
	
	
}
