package com.Rest.Easy.Config;

import com.Rest.Easy.Laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LaptopService {
    private static List<Laptop> laptops = new ArrayList<>();
    private static int counter = 1;

    static {
        // Add sample laptops
        laptops.add(new Laptop(counter++, "Laptop A", 500));
        laptops.add(new Laptop(counter++, "Laptop B", 700));
    }

    // Create Laptop
    public Laptop createLaptop(Laptop laptop) {
        laptop.setId(counter++);
        laptops.add(laptop);
        return laptop;
    }

    // Get all Laptops
    public List<Laptop> getAllLaptops() {
        return laptops;
    }

    // Get Laptop by ID
    public Optional<Laptop> getLaptopById(int id) {
        return laptops.stream().filter(laptop -> laptop.getId() == id).findFirst();
    }

    // Update Laptop by ID
    public boolean updateLaptop(int id, Laptop newLaptop) {
        Optional<Laptop> existingLaptop = getLaptopById(id);
        if(existingLaptop.isPresent()) {
            existingLaptop.get().setName(newLaptop.getName());
            existingLaptop.get().setPrice(newLaptop.getPrice());
            return true;
        }
        return false;
    }

    // Delete Laptop by ID
    public boolean deleteLaptop(int id) {
        return laptops.removeIf(laptop -> laptop.getId() == id);
    }
}

