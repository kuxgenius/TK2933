package Test3BX;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PollingStation {
	Voter voter;

	int numArrivals; // number of arrivals in any minute
	Queue<Voter> queue;
	Queue<Voter> queue1;
	
	int[] totalWaitingTime,totalWaitingTime1;
	int numVoterServed = 0,numVoterServed1 =0;
	
	int fussy1 =0, disable1 =0, normal1 =0;
	int fussy =0, disable =0, normal =0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PollingStation po = new PollingStation();
		po.simulate();
	}

	public PollingStation(){
		
		numArrivals = 0;
		//totalWaitingTime = 0;
		numVoterServed = 0;
		numVoterServed1=0;
		
		queue = new Queue<Voter>();
		queue1 = new Queue<Voter>();
		
	}

	private void displayStatistics() {
		numVoterServed = normal+disable+fussy;
		numVoterServed1 = normal1+disable1+fussy1;
		
		for(int i=0;i<numVoterServed;i++) {
			int numV = i+1;
			System.out.println("Channel 5: Voter "+numV+" can start voting at "+totalWaitingTime[i]+"th minute");
		}
		
		for(int i=0;i<numVoterServed1;i++) {
			int numV = i+1;
			System.out.println("Channel 6: Voter "+numV+" can start voting at "+totalWaitingTime1[i]+"th minute");
		}
		
		System.out.println();
		System.out.println("Number of voters served at Channel 5: "+numVoterServed);
		System.out.println("Normal: "+normal+", With disability: "+disable+", Fussy: "+fussy);
		System.out.println("Voters left in queue: "+queue.size());
		
		System.out.println();
		System.out.println("Number of voters served at Channel 6: "+numVoterServed1);
		System.out.println("Normal: "+normal1+", With disability: "+disable1+", Fussy: "+fussy1);
		System.out.println("Voters left in queue: "+queue1.size());
	}

	public void simulate(){
		int serviceTime = 0, serviceTime1 =0;
		int minServTime = 5,minServTime1 =5;
		int startService = 0,startService1 =0;
		
		try {
			Scanner sc = new Scanner(new File("input2.dat"));
			int num = sc.nextInt();

			while (sc.hasNextLine()) {
				int arrTime = sc.nextInt();
				int voterType = sc.nextInt();
				int channelNo = sc.nextInt();
				
				Voter v = new Voter(arrTime,voterType);
				
				if(channelNo == 5) {
					queue.enqueue(v);
				}
				else if(channelNo == 6) {
					queue1.enqueue(v);
				}
			}
			int x = queue.size();
			totalWaitingTime = new int[x];
			for (int i=0; i<x;i++) {
				if(serviceTime < 60) {
					Voter temp = queue.dequeue();
					if(serviceTime==0)
						serviceTime += temp.getArrivalTime();
					else if(serviceTime < temp.getArrivalTime())
						serviceTime = temp.getArrivalTime();
					serviceTime += temp.getServiceTime();
					if(serviceTime < 60) {
						totalWaitingTime[i] = serviceTime;					
						//calculate type
						if(temp.getVoterType()==1)
							normal++;
						else if(temp.getVoterType()==2)
							disable++;
						else if(temp.getVoterType()==3)
							fussy++;
					}
					else
						queue.enqueue(temp);
				}
			}
			
			x = queue1.size();
			totalWaitingTime1 = new int[x];
			for (int i=0; i<x;i++) {
				if(serviceTime1 < 60) {
					Voter temp = queue1.dequeue();
					if(serviceTime1==0)
						serviceTime1 += temp.getArrivalTime();
					else if(serviceTime1 < temp.getArrivalTime())
						serviceTime1 = temp.getArrivalTime();
					serviceTime1 += temp.getServiceTime();
					if(serviceTime1 < 60) {
						totalWaitingTime1[i] = serviceTime1;					
						//calculate type
						if(temp.getVoterType()==1)
							normal1++;
						else if(temp.getVoterType()==2)
							disable1++;
						else if(temp.getVoterType()==3)
							fussy1++;
					}
					else
						queue.enqueue(temp);
				}
			}
			sc.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		displayStatistics();


	}



}

