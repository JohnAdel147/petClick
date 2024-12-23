package com.company.petclinic.view.pettype;

import com.company.petclinic.entity.PetType;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "petTypes", layout = MainView.class)
@ViewController("PetType.list")
@ViewDescriptor("pet-type-list-view.xml")
@LookupComponent("petTypesDataGrid")
@DialogMode(width = "64em")
public class PetTypeListView extends StandardListView<PetType> {
}