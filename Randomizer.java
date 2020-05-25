import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Randomizer {

	private static final List<String> firstNames = Arrays.asList("Amayah","Stacey","Aleisha","Abubakr","Sukhmani","Emilio","Lillia","Reiss","Tahir","Afsana","Cleveland","Huxley","Maya","Rikki","Melissa","Princess","Letitia","Neive","Anam","Cayson","Geoffrey","Henri","Ottilie","Penelope","Juno","Eric","Dawid","Angelo","Nuha","Mylee","Cadi","Emilija","Jez","Jayden","Tianna","Otto","Christina","Conah","Seren","Remy","Leticia","Charly","Rima","Can","Tonicha","Scarlette","Kali","Jasper","Marianne","Kacper","Tiago","Abbie","Sahil","Jonty","Jessie","Riccardo","Amina","Tamanna","Katarina","Ameer","Hana","Wilf","Drew","Izzy","Malaki","Ainsley","Cecily","Amritpal","Ariadne","Kyan","Malika","Karol","Sumayya","Aysha","Margo","Reagan","Samuel","Daniella","Imogen","Keane","Prince","Yousaf","Lemar","Rafe","Rebecca","Ruby","Domas","Irene","Jeff","Lorelei","Rhona","Stella","Giacomo","Bryson","Haroon","Cole","Pierce","Ayyan","Willem","Kristie");
	private static final List<String> lastNames = Arrays.asList("Brennan","Fritz","Pratt","Farrow","Prince","Clayton","Floyd","Mellor","Conroy","Haworth","Hume","Campbell","Carson","Kim","Whiteley","Reyes","Thompson","Lord","Blair","Hudson","Mcnally","Haley","Peterson","Gibbs","Bird","Wickens","Forster","Evans","Ryan","Barr","Turnbull","Knowles","Goddard","Haines","Wood","Woolley","Zamora","Reyna","Gray","Flower","Roberson","Ramsay","Kenny","Hester","Weir","Lester","Mckeown","Serrano","Naylor","Park","Dickens","Bender","Greenwood","Dickinson","Philip","Shields","Phillips","Higgs","Griffiths","Valdez","Larsen","Hardin","Walsh","Pham","Kelley","Harrington","Robson","Power","Woods","Martins","Connelly","Chandler","Mercer","Oneil","Maxwell","Ray","Weston","Romero","Beech","Sandoval","Krueger","Fields","Hackett","Landry","Byrne","Vincent","Hays","Bates","Rivas","Mansell","Hutchings","Lam","Lovell","Davis","Devlin","Stein","Davey","Allen","Buck","Beck");
	private static final Random random = new Random();

	public static String getFirstName() {
		int index = random.nextInt(100);
		return firstNames.get(index);
	}

	public static String getLastName() {
		int index = random.nextInt(100);
		return lastNames.get(index);
	}

	public static String getPhoneNumber() {
		int min = 100000;
		int max = 999999;
		int num = min + random.nextInt(max - min);
		return "+37477" + num;
	}
}