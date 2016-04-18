package model;

import java.util.Date;

import javax.ejb.Remote;

@Remote
public interface DateService {
    Date getDate();
}
