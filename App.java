import model.EducationDivision; 
import model.PubManagement; 
import model.SpiritualDivision; 
import model.WalfareDivision; 

public class App { 
   public static void main(String[] args) throws Exception { 
       // instansiasi objek seperti biasa 
       PubManagement pengurus = new PubManagement(); 
       EducationDivision divdik = new EducationDivision(); 
       SpiritualDivision rohani = new SpiritualDivision(); 
       WalfareDivision sejahtera = new WalfareDivision(); 

       // memanggil properti atau method di class super 
       pengurus.reportJob(); 

       // mengolah properti atau method di class subclass 
       divdik.programmingLang = "Java"; 
       rohani.absentOfficer = "Wabred"; 
       sejahtera.absentBreackfast(); 

       // mengakses properti atau method yang ada 
       // di class super, tapi menggunakan subclass 
       rohani.generation = 20; 
       System.out.println(rohani.generation); 

       divdik.major = "Akuntansi";
       System.out.println(divdik.major);

       rohani.reportJob();
   } 
} 