package com.pvb;

import java.util.List;
/**
 * Created by pauljava on 06/12/2017.
 */
public interface ISaveable {
    List<String> write();
    void read (List<String> savedValues);
}
