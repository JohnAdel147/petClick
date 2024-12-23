package com.company.petclinic.view.myvisits;


import com.company.petclinic.entity.TreatmentStatus;
import com.company.petclinic.entity.User;
import com.company.petclinic.entity.Visit;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "MyVisits", layout = MainView.class)
@ViewController("Myvisits")
@ViewDescriptor("MyVisits.xml")
public class Myvisits extends StandardView {
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private CollectionLoader<Visit> visitsDl;
    @ViewComponent
    private DataGrid<Visit> visitsDataGrid;
    @ViewComponent
    private DataContext dataContext;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        final User user = (User) currentAuthentication.getUser();
        visitsDl.load();
    }

    @Subscribe(id = "startBtn", subject = "clickListener")
    public void onStartBtnClick(final ClickEvent<JmixButton> event) {
        Visit visit = visitsDataGrid.getSingleSelectedItem();
        if(visit == null){
            return;
        }
        visit.setStatus(TreatmentStatus.IN_PROGRASS);
        dataManager.save(visit);

    }

    @Subscribe(id = "finishBtn", subject = "clickListener")
    public void onFinishBtnClick(final ClickEvent<JmixButton> event) {
        Visit visit = visitsDataGrid.getSingleSelectedItem();
        if(visit == null){
            return;
        }
        visit.setStatus(TreatmentStatus.DONE);
        dataManager.save(visit);

    }

    @Subscribe(id = "saveButton", subject = "clickListener")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        dataManager.save(visitsDataGrid);
        dataContext.save();
        close(StandardOutcome.SAVE);
    }

    @Subscribe(id = "discardButton", subject = "clickListener")
    public void onDiscardButtonClick(final ClickEvent<JmixButton> event) {
        close(StandardOutcome.DISCARD);
    }
}