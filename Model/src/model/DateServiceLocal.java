package model;

import java.util.Date;

import javax.ejb.Local;

@Local
public interface DateServiceLocal {
    Date getDate();
}
