class CPU{
double price;
	
	CPU(double p){
		price=p;
		}	
	
	class Processor{
		int noCore;
		String manufacturer;
		
		Processor(int no,String manuf){
			noCore=no;
			manufacturer=manuf;
			}
		
		void display(){
			System.out.println("No of cores: "+noCore);
			System.out.println("Name of manufacturer: "+manufacturer);
			}	
		}	
		
	static class RAM{
		String memory,manufacturer;
		
		RAM(String mem,String manuf){
			memory=mem;
			manufacturer=manuf;
			}
		
		void display(){
			System.out.println("Memory is: "+memory+"\nManufacturer is: "+manufacturer);
			}	
		
		}
	
	void CPUDisplay(){
		System.out.println("Price of CPU is: "+price);
		}	
	}


class CPUDetails{
	public static void main(String []args){
		
		CPU cpu=new CPU(100.00);
		
		cpu.CPUDisplay();
		
		CPU.Processor processor=cpu.new Processor(8,"Nvidia");
		
		processor.display();
		
		CPU.RAM ram=new CPU.RAM("512 GB","Samsung");
		
		ram.display();		
		
		}	
	}	
	
	
