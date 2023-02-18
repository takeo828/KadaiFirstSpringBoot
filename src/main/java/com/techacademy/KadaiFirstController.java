package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {

        String year = val1.substring(0,4);
        String month = val1.substring(4,6);
        String day = val1.substring(6,8);

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        LocalDate week = LocalDate.of(y, m, d);
        DayOfWeek week_name = week.getDayOfWeek();
        return "計算結果：" + week_name;

    }




    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 + val2;
        return "計算結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 - val2;
        return "計算結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 * val2;
        return "計算結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 / val2;
        return "計算結果：" + res;
    }
}
