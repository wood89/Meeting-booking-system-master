package com.mls.booking.meetingSchedule;

import com.mls.booking.model.EmployeeMeetingSchedule;
import org.joda.time.LocalDateTime;

public class ScheduleIntervalNode {

    public ScheduleIntervalNode leftNode;
    public LocalDateTime meetingStartTime;
    public LocalDateTime meetingEndTime;
    public LocalDateTime maxMeetingEndTime;
    public ScheduleIntervalNode rightNode;
    public EmployeeMeetingSchedule employeeMeetingSchedule;

    public ScheduleIntervalNode(final ScheduleIntervalNode leftNode, final LocalDateTime meetingStartTime,
                                final LocalDateTime meetingEndTime, final LocalDateTime maxMeetingEndTime,
                                final ScheduleIntervalNode right, final EmployeeMeetingSchedule employeeMeetingSchedule) {
        this.leftNode = leftNode;
        this.meetingStartTime = meetingStartTime;
        this.meetingEndTime = meetingEndTime;
        this.maxMeetingEndTime = maxMeetingEndTime;
        this.rightNode = right;
        this.employeeMeetingSchedule = employeeMeetingSchedule;
    }

}
