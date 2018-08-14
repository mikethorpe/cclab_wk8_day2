import db.DBHelper;
import models.Director;
import models.Film;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

		Director quentin = new Director("Quentin", "Tarantino");
		DBHelper.save(quentin);
		Director edgar = new Director("Edgar", "Wright");
		DBHelper.save(edgar);


		Film pulp = new Film("Pulp Fiction", quentin, 18);
		DBHelper.save(pulp);

		Film babyDriver = new Film("Baby Crier", edgar, 18);
		DBHelper.save(babyDriver);

		babyDriver.setTitle("Baby Driver");
		DBHelper.update(babyDriver);


    	Film killBillVol1 = new Film("Kill Bill Volume 1", quentin, 18);
    	DBHelper.save(killBillVol1);

//    	Film leon = new Film("Leon", "Luc Besson", 18);
//    	DBHelper.save(leon);

		List<Film> allFilms = DBHelper.getAll(Film.class);

//		Film findLeon = DBHelper.findById(Film.class, leon.getId());

//		DBHelper.delete(pulp);

    }

}
