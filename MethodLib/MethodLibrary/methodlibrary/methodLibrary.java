package methodlibrary;

import java.util.Scanner;

public class methodLibrary {

	public static void main(String[] args) {
		
		System.out.println(FahTillKel(3) + " Kelvin");
		System.out.println(KTillC(2) + " Celsius");
		System.out.println(VelConversion(20) + " Meter/sekunden");
		System.out.println(kineticEnergi(2,3) + " joule");
		System.out.println(potEnergi(2,5) + " joule");
		System.out.println("Medelv�rdet �r: " + Mean(1,5,9));
		Paparazzi();
		Prog();
		System.out.println(Time(10, 2)+ " Sekunder");
		System.out.println(Work(50, 10)+ " Watt");
		System.out.println(VTH(9.82) + " Meter");
		System.out.println(RadSphe(20));
		System.out.println(VolSphe(10) + " cm^3");
		System.out.println("Av en stack tr� f�r du " +  Door(64) + " d�rrar i minecraft");
	}
		/**
		 * F�r in v�rdet av Fahrenheit som g�rs om till kelvin
		 * @param fahrenheit
		 * @return kelvin
		 */
		public static double FahTillKel(double fahrenheit) {
			double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
			return kelvin;
			
		}
		
		/**
		 * F�r in v�rdet av Kelvin som g�rs om till celsius
		 * @param kelvin
		 * @return celsius
		 */
		public static double KTillC(double kelvin) {
			double celsius = kelvin - 273.15;
			return celsius;
		}
		
		/**
		 * Tar in km/t som �r 20 och omvandlar det till m/s
		 * @param kms
		 * @return ms
		 */
		public static double VelConversion(double kmt) {
			double ms = kmt / 3.6;
			return ms;
			
		}
		
		/**
		 * Tar in massa och hastighet och multiplicerar dem och skickar tillbaka produkten som �r kinetisk energi
		 * @param mass
		 * @param velocity
		 * @return
		 */
		public static double kineticEnergi(double mass, double velocity) {
			double kEnergi = mass * velocity;
			return kEnergi;
			
		}
		
		/**
		 
		 * Tar in massa och h�jd och multiplicerar dem med gravitationen och skickar tillbaka produkten som �r potensiell energi
		 * @param mass
		 * @param height
		 * @return
		 */
		public static double potEnergi (double mass, double height) {
			double pEnergi = mass * height * 9.82;
			return pEnergi;
			
		}
		
		/**
		 * Tar in 3 v�rden och best�mer medelv�rdet p� dem och skickar tillbaks det sen
		 * @param first
		 * @param second
		 * @param third
		 * @return
		 */
		public static double Mean(double first, double second, double third) {
			double mean = (first + second + third)/3 ;
			return mean;
		}
		
		/**
		 * Tar och g�r om de stora bokst�verna till sm�
		 */
		public static void Paparazzi(){
			String papa = "PaParaZZi";
			System.out.println(papa.toLowerCase());

		}
		
		/**
		 * Tar och g�r om o till 0 och g�r alla bokst�ver stora
		 */
		public static void Prog() {
			String iprog = "Jag vill bli godk�nd i programmering! <3";
			System.out.println(iprog.toUpperCase().replace('O', '0'));
			
		}
		/**
		 * Tar in distans och hastighet och r�knar ut tiden ted tar
		 * @param distance
		 * @param velocity
		 * @return tid
		 */
		public static double Time(double distance, double velocity) {
			double tid = distance/velocity;
			return tid;
		}
		
		/**
		 * Tar in kraft och str�cka och r�knar ut arbetet f�r dem
		 * @param force
		 * @param distance
		 * @return
		 */
		public static double Work(double force, double distance) {
			double work = force * distance;
			return work;
		}
		/**
		 * Tar in hastighet och g�r om till h�jd
		 * @param velocity
		 * @return
		 */
		public static double VTH(double velocity){
			double VeToHe = Math.pow(velocity, 2) / (9.82 * 2);
			return VeToHe;
		}
		
		/**
		 * Tar och g�r om volymen av en sf�r till radien
		 * @param volume
		 * @return
		 */
		public static double RadSphe(double volume) {
			double radie = ( Math.cbrt((3 * volume) / (4 * Math.PI)) );
			return radie;
		}
		
		/**
		 * Tar in radien till en sf�r och m�ter ut volymer p� den
		 * @param radie
		 * @return volym
		 */
		public static double VolSphe(double radie) {
			double volym = Math.pow(radie, 3) * (4 * Math.PI);
			return volym;
		}
		
		/**
		 * Tar in en stack(64) logs och r�knar ut hur m�nga minecraft doors jag kan crafta
		 * @param logs
		 * @return doors
		 */
		public static double Door(double logs) {
			double doors = (logs * 4)/6 * 3;
			return doors;
		}
	}

