package com.company.petclinic.view.speciality;

import com.company.petclinic.entity.Speciality;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "specialities", layout = MainView.class)
@ViewController("Speciality.list")
@ViewDescriptor("speciality-list-view.xml")
@LookupComponent("specialitiesDataGrid")
@DialogMode(width = "64em")
public class SpecialityListView extends StandardListView<Speciality> {
}