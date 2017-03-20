/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

/**
 *
 * @author Formation
 */
public class RolesAndRights {
    
    private long user_ID;
    private boolean admin;
    private boolean blocked;
    
    public RolesAndRights(){}
     
     public RolesAndRights(long user_ID,boolean admin, boolean blocked){
     
         this.admin=admin;
         this.blocked=blocked;
         this.user_ID=user_ID;
     
     
     }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.user_ID ^ (this.user_ID >>> 32));
        hash = 47 * hash + (this.admin ? 1 : 0);
        hash = 47 * hash + (this.blocked ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RolesAndRights other = (RolesAndRights) obj;
        if (this.user_ID != other.user_ID) {
            return false;
        }
        if (this.admin != other.admin) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RolesAndRights{" + "user_ID=" + user_ID + ", admin=" + admin + ", blocked=" + blocked + '}';
    }

    public long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
