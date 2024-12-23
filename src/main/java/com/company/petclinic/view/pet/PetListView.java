package com.company.petclinic.view.pet;

import com.company.petclinic.entity.Pet;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "pets", layout = MainView.class)
@ViewController("Pet.list")
@ViewDescriptor("pet-list-view.xml")
@LookupComponent("petsDataGrid")
@DialogMode(width = "64em")
public class PetListView extends StandardListView<Pet> {
}