package Test3B;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SereneClinic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,time,treatment,type,room,totalTime;
		
		try {
			Scanner in = new Scanner(new File("input.dat"));
			Queue<Patient> queue1 = new Queue<Patient>();
			Queue<Patient> queue2 = new Queue<Patient>();
			Queue<Patient> treated = new Queue<Patient>();
			
			n = in.nextInt();
			
			for (int i=1;i<=n;i++) {
				time = in.nextInt();
				treatment = in.nextInt();
				type = in.nextInt();
				room = in.nextInt();
				
				Patient pt = new Patient(time,treatment,type,room);
				
				if(room == 1) {
					queue1.enqueue(pt);
				}
				else {
					queue2.enqueue(pt);
				}
					
			}
			//System.out.println("Q1 treated: "+queue1.size());
			//System.out.println("Q2 treated: "+queue2.size());
			x = queue1.size();
			totalTime = 0;
			for (int i=1; i<=x;i++) {
				if(totalTime < 60) {
					Patient temp = queue1.dequeue();
					if(totalTime==0)
						totalTime += temp.getTime();
					totalTime += temp.getTreatmentTime();
					temp.setTreatedTime(totalTime);
					if(totalTime < 60)
						treated.enqueue(temp);
					else
						queue1.enqueue(temp);
				}
				//System.out.println("Q1"+totalTime);
			}
			x = queue2.size();
			totalTime = 0;
			for (int i=1; i<=x;i++) {
				if(totalTime < 60) {
					Patient temp = queue2.dequeue();
					if(totalTime==0)
						totalTime += temp.getTime();
					totalTime += temp.getTreatmentTime();
					temp.setTreatedTime(totalTime);
					if(totalTime < 60)
						treated.enqueue(temp);
					else
						queue2.enqueue(temp);
				}
				//System.out.println("Q2"+totalTime);
			}
			
			printSummary(treated,queue1,queue2);
			in.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void printSummary(Queue<Patient> tr,Queue<Patient> q1,Queue<Patient> q2) {
		int ty1r1=0,ty2r1=0,ty3r1=0;
		int ty1r2=0,ty2r2=0,ty3r2=0;
		int p1=0,p2=0;
		
		//System.out.println("Patients treated: "+tr.size());
		
		while(!tr.isEmpty()) {
			Patient out = tr.dequeue();
			if(out.getRoom()==1) {
				p1++;
				if(out.getType()==1)
					ty1r1++;
				else if(out.getType()==2)
					ty2r1++;
				else if(out.getType()==3)
					ty3r1++;
				System.out.println("Room"+out.getRoom()+": Patient "+p1+" is treated at "+out.getTreatedTime()+"th minute");
			}
			else if(out.getRoom()==2) {
				p2++;
				if(out.getType()==1)
					ty1r2++;
				else if(out.getType()==2)
					ty2r2++;
				else if(out.getType()==3)
					ty3r2++;
				System.out.println("Room"+out.getRoom()+": Patient "+p2+" is treated at "+out.getTreatedTime()+"th minute");
			}
			
		}
		
		System.out.println();
		System.out.println("Number of patients treated by Doctor 1: "+p1);
		System.out.println("Normal: "+ty1r1+", Infant: "+ty2r1+", Elderly: "+ty3r1);
		System.out.println("Patients left in queue: "+q1.size());
		
		System.out.println();
		System.out.println("Number of patients treated by Doctor 2: "+p2);
		System.out.println("Normal: "+ty1r2+", Infant: "+ty2r2+", Elderly: "+ty3r2);
		System.out.println("Patients left in queue: "+q2.size());
		
	}

}
