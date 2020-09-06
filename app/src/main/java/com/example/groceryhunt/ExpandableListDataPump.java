package com.example.groceryhunt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap();

        List<String> Fruits = new ArrayList();
        Fruits.add("All Fruits");
        Fruits.add("Fresh Fruits");
        Fruits.add("Cuts & Sprouts");

        List<String> Vegetables = new ArrayList();
        Vegetables.add("All Vegetables");
        Vegetables.add("Fresh Vegetables");
        Vegetables.add("Seasonal Vegetables");
        Vegetables.add("Organic Vegetables");

        List<String> Spices = new ArrayList();
        Spices.add("All Spices");
        Spices.add("Powdered Spices");
        Spices.add("Whole Spices");

        List<String> Dry_Fruits = new ArrayList();
        Dry_Fruits.add("All Dry Fruits");
        Dry_Fruits.add("Almonds & Cashews");
        Dry_Fruits.add("Nuts & Seeds");

        List<String> Cereal = new ArrayList();
        Cereal.add("Pulses");
        Cereal.add("Atta & Other Flours");
        Cereal.add("Rice & Other Grains");
        Cereal.add("Edible Oils");
        Cereal.add("Salt & Sugar");
        Cereal.add("Ghee & Vanaspati");

        List<String> Beverages = new ArrayList();
        Beverages.add("Soft Drinks");
        Beverages.add("Juices & Concentrates");
        Beverages.add("Tea & Coffee");
        Beverages.add("Health & Energy Drinks");
        Beverages.add("Water & Soda");
        Beverages.add("Milk Drinks");

        List<String> Personal_Care = new ArrayList();
        Personal_Care.add("Bath & Body");
        Personal_Care.add("Hair Care");
        Personal_Care.add("Skin Care");
        Personal_Care.add("Deos & Perfumes");
        Personal_Care.add("Cosmetics");

        List<String> Pet_Care = new ArrayList();
        Pet_Care.add("Dog Supplies");
        Pet_Care.add("Cat Supplies");

        List<String> Poultry_and_Dairy = new ArrayList();
        Poultry_and_Dairy.add("Bread & Eggs");
        Poultry_and_Dairy.add("Milk & Milk Product");
        Poultry_and_Dairy.add("Butter & Cheese");
        Poultry_and_Dairy.add("Jams, Honey & Spreads");
        Poultry_and_Dairy.add("Breakfast Cereal & mixes");

        expandableListDetail.put("FRUITS", Fruits);
        expandableListDetail.put("VEGETABLES", Vegetables);
        expandableListDetail.put("SPICES", Spices);
        expandableListDetail.put("DRY FRUITS", Dry_Fruits);
        expandableListDetail.put("CEREAL", Cereal);
        expandableListDetail.put("BEVERAGES", Beverages);
        expandableListDetail.put("PERSONAL CARE", Personal_Care);
        expandableListDetail.put("PET CARE", Pet_Care);
        expandableListDetail.put("POULTRY & DAIRY", Poultry_and_Dairy);
        return expandableListDetail;
    }
}
