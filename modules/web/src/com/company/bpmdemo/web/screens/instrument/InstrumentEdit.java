package com.company.bpmdemo.web.screens.instrument;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmdemo.entity.Instrument;

@UiController("bpmdemo_Instrument.edit")
@UiDescriptor("instrument-edit.xml")
@EditedEntityContainer("instrumentDc")
@LoadDataBeforeShow
public class InstrumentEdit extends StandardEditor<Instrument> {
}