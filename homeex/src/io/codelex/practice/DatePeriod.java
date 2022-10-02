package io.codelex.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate periodStart;
    private LocalDate periodEnd;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.periodStart = start;
        this.periodEnd = end;
    }

    public DatePeriod intersection(DatePeriod period) {
        LocalDate pStart = this.periodStart;
        LocalDate pEnd = this.periodEnd;
        if (pStart.isBefore(period.periodStart) && pEnd.isAfter(period.periodEnd)) {
            return period;
        }
        if (pStart.isAfter(period.periodStart) && pEnd.isBefore(period.periodEnd)) {
            return this;
        }
        if (pStart.isAfter(period.periodEnd) || pEnd.isBefore(period.periodStart)) {
            return null;
        }
        if (pStart.isBefore(period.periodStart)) {
            pStart = period.periodStart;
        }
        if (pEnd.isAfter(period.periodEnd)) {
            pEnd = period.periodEnd;
        }
        return new DatePeriod(pStart, pEnd);


    }

    public String toString() {
        return "DatePeriod{" +
                "periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                '}';
    }


}
