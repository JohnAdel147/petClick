package com.company.petclinic.view.visit;

import com.company.petclinic.entity.Visit;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "visits", layout = MainView.class)
@ViewController("Visit.list")
@ViewDescriptor("visit-list-view.xml")
@LookupComponent("visitsDataGrid")
@DialogMode(width = "64em")
public class VisitListView extends StandardListView<Visit> {
}