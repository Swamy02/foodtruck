package foodtruck.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import foodtruck.bean.FoodTruck;

@RestController
@RequestMapping("/api/foodtrucks")
public class FoodTruckService {

	@GetMapping("/getAllFoodTruck")
	private List<FoodTruck> parseFoodTruckData(String fileName) throws CsvValidationException {
		List<FoodTruck> trucks = new ArrayList<>();
		try (CSVReader reader = new CSVReader(
				new FileReader(getClass().getClassLoader().getResource("Mobile_Food_Facility_Permit.csv").getFile()))) {
			String[] nextLine;
			reader.readNext(); // Skip header row
			while ((nextLine = reader.readNext()) != null) {
				FoodTruck truck = new FoodTruck();
				truck.setLocationId(nextLine[0]);
				truck.setApplicantName(nextLine[1]);
				truck.setFacilityType(nextLine[2]);
				truck.setCnn(nextLine[3]);
				truck.setLocationDescription(nextLine[4]);
				truck.setAddress(nextLine[5]);
				truck.setBlocklot(nextLine[6]);
				truck.setBlock(nextLine[7]);
				truck.setLot(nextLine[8]);
				truck.setPermit(nextLine[9]);
				truck.setStatus(nextLine[10]);
				truck.setFoodItems(nextLine[11]);
				truck.setSchedule(nextLine[16]);
				truck.setDayshours(nextLine[17]);
				truck.setNoisent(nextLine[18]);
				truck.setApproved(nextLine[19]);
				truck.setReceived(nextLine[20]);
				truck.setPriorPermit(nextLine[21]);
				truck.setExpirationDate(nextLine[22]);
				truck.setLocation(nextLine[23]);
				truck.setFirePreventionDistricts(nextLine[24]);
				truck.setPoliceDistricts(nextLine[25]);
				truck.setSupervisorDistricts(nextLine[26]);
				truck.setZipCodes(nextLine[27]);
				truck.setNeighborhoods(nextLine[28]);
				trucks.add(truck);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return trucks;
	}
}
