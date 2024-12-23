package com.company.petclinic.view.owner;

import com.company.petclinic.entity.Owner;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "owners", layout = MainView.class)
@ViewController("Owner.list")
@ViewDescriptor("owner-list-view.xml")
@LookupComponent("ownersDataGrid")
@DialogMode(width = "64em")
public class OwnerListView extends StandardListView<Owner> {
}