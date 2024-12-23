package com.company.petclinic.view.pet;

import com.company.petclinic.entity.Pet;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

@Route(value = "pets/:id", layout = MainView.class)
@ViewController("Pet.detail")
@ViewDescriptor("pet-detail-view.xml")
@EditedEntityContainer("petDc")
public class PetDetailView extends StandardDetailView<Pet> {
    @Autowired
    private DataManager dataManager;


    @Subscribe
    public void onInitEntity(final InitEntityEvent<Pet> event) {
        Pet pet = event.getEntity();

        Pet lastPet = dataManager.load(Pet.class).query("SELECT e FROM Pet e ORDER BY e.identificationNumber DESC").one();


        if(lastPet.getIdentificationNumber() == null){
            pet.setIdentificationNumber(1);
        }
        else {
            pet.setIdentificationNumber(lastPet.getIdentificationNumber()+1);
        }

//        pet.setIdentificationNumber(generateUniqueNumber());

    }

//    private static AtomicInteger counter = new AtomicInteger();
//
//    public static Integer generateUniqueNumber() {
//        return counter.incrementAndGet(); // Generate unique integer
//    }

}