/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a field to store the weather display TextView
    TextView weatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        weatherData = (TextView)findViewById(R.id.tv_weather_data);

        // COMPLETED (3) Create an array of Strings that contain fake weather data
        String tempDetails[] = {
                "19th Feb, Monday: 20°C",
                "20th Feb, Tuesday: 20°C",
                "21st Feb, Wednesday: 20°C",
                "22nd Feb, Thursday: 20°C",
                "23rd Feb, Friday: 20°C",
                "24th Feb, Saturday: 20°C",
                "25th Feb, Sunday: 20°C",
                "26th Feb, Monday: 20°C",
                "27th Feb, Tuesday: 20°C",
                "28th Feb, Wednesday: 20°C",
                "1st Mar, Thursday: 20°C",
                "2nd Mar, Friday: 20°C",
                "3rd Mar, Saturday: 20°C",
                "4th Mar, Sunday: 20°C",
        };

        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for(String tempDetail: tempDetails) {
            weatherData.append(tempDetail + "\n\n\n");
        }
    }
}