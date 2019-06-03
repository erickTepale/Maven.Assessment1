package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] petsArr;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;

        petsArr = pets;
        assignOwnerToPets();
    }

    private void assignOwnerToPets(){
        if(petsArr != null ) {
            for (Pet i : petsArr)
                i.setOwner(this);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(petsArr != null) {
            Pet[] newPet = new Pet[petsArr.length + 1];
            newPet[petsArr.length] = pet;
            petsArr = newPet;
        }else{
            petsArr = new Pet[1];
            petsArr[0] = pet;
        }
        assignOwnerToPets();
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
//        ArrayList<Pet> fresh = new ArrayList<>();
//        for (int i = 0; i <pets.length; i++) {
//            if(!( pet.getName().equals(pets[i].getName())) )
//                fresh.add(pets[i]);
//        }
//        fresh.toArray(pets);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return null;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petsArr.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return null;
    }
}
