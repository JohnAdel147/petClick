package com.company.petclinic.view.vet;

import com.company.petclinic.entity.Vet;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "vets", layout = MainView.class)
@ViewController("Vet.list")
@ViewDescriptor("vet-list-view.xml")
@LookupComponent("vetsDataGrid")
@DialogMode(width = "64em")
public class VetListView extends StandardListView<Vet> {
}