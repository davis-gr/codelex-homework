package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;

public class DatePeriod {

    LocalDate periodStart;
    LocalDate periodEnd;

    public DatePeriod(LocalDate periodStart, LocalDate periodEnd) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }

    // I made only one method here as it is the shortest way + it's quite understandable in my mind.
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

    @Override
    public String toString() {
        return "DatePeriod{" +
                "periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                '}';
    }
}
