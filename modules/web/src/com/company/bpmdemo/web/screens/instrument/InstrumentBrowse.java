package com.company.bpmdemo.web.screens.instrument;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmdemo.entity.Instrument;

@UiController("bpmdemo_Instrument.browse")
@UiDescriptor("instrument-browse.xml")
@LookupComponent("instrumentsTable")
@LoadDataBeforeShow
public class InstrumentBrowse extends StandardLookup<Instrument> {
}