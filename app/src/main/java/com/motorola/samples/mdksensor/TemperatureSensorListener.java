package com.motorola.samples.mdksensor;

import com.motorola.mod.ModDevice;

/**
 * Created by gventura on 20/05/2017.
 */

public interface TemperatureSensorListener {
    void onModDevice(ModDevice device);
    void onFirstResponse(boolean challengePassed);
    void onRequestRawPermission();
    void onTemperatureData(double temperature);
}
