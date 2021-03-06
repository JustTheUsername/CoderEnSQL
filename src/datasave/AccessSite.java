/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.util.Objects;

/**
 *
 * @author Formation
 */
public class AccessSite {

    private long user_ID;
    private String nickname;
    private String password;

    public AccessSite() {
    }

    ;
    
    public AccessSite(long user_id, String nickname, String password) {

        this.nickname = nickname;
        this.password = password;
        this.user_ID = user_id;
    }

    public long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.user_ID ^ (this.user_ID >>> 32));
        hash = 83 * hash + Objects.hashCode(this.nickname);
        hash = 83 * hash + Objects.hashCode(this.password);
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
        final AccessSite other = (AccessSite) obj;
        if (this.user_ID != other.user_ID) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccessSite{" + "user_ID=" + user_ID + ", nickname=" + nickname + ", password=" + password + '}';
    }

}
