package RocketProject;
//simulation class

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Simulation {
	// Method to load items from a text file and return an arraylist of item

	ArrayList<Item> loadItems(String filePath) {
		ArrayList<Item> items = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split("=");
				String name = parts[0].trim();
				int weight = Integer.parseInt(parts[1].trim());
				Item item = new Item();
				item.name = name;
				item.weight = weight;
				items.add(item);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return items;
	}
//Method to load R1 rockets and fill them with items

	ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R1 rocket = new R1();
		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R1();
				rocket.carry(item);
			}

		}
		rockets.add(rocket);
		return rockets;
	}
	
	//Method to load R2 rockets and fill them with items

		ArrayList<Rocket> loadU2(ArrayList<Item> items) {
			ArrayList<Rocket> rockets = new ArrayList<>();
			R2 rocket = new R2();
			for (Item item : items) {
				if (rocket.canCarry(item))
				{
					System.out.print(" "+item.name);
					System.out.println(" "+item.weight);
					rocket.carry(item);
				} else {
					rockets.add(rocket);
					rocket = new R2();
					rocket.carry(item);
				}

			}
			rockets.add(rocket);
			return rockets;
		}
		
		//method to run simulation and calculate total budget
		
		int runSimulation(ArrayList<Rocket>rockets)
		{
			int totalBudget=0;
			for(Rocket rocket:rockets)
			{
				totalBudget=totalBudget+rocket.rocketCost;
					while(!rocket.launch()||!rocket.land())
					{
						totalBudget=totalBudget+rocket.rocketCost;
						//System.out.println(totalBudget);
					
				}
			}
			return totalBudget;
		}

		
}