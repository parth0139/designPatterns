package com.fininfra.impl;

public class DatabaseConfig {
    private final  String url;
    private final  String password;
    private final  String username;
    private final  String driverClassName;
    private final  String connectionPoolSize;
    private final  String connectionTimeout;
    private final  String idleTimeout;

    private DatabaseConfig(Builder configBuilder){
        this.url = configBuilder.url;
        this.password = configBuilder.password;
        this.username = configBuilder.username;
        this.driverClassName = configBuilder.driverClassName;
        this.connectionPoolSize = configBuilder.connectionPoolSize;
        this.connectionTimeout = configBuilder.connectionTimeout;
        this.idleTimeout = configBuilder.idleTimeout;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getConnectionPoolSize() {
        return connectionPoolSize;
    }

    public String getConnectionTimeout() {
        return connectionTimeout;
    }

    public String getIdleTimeout() {
        return idleTimeout;
    }

    public String toString(){
        return "DatabaseConfig{" +
                "url='" + url + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", connectionPoolSize='" + connectionPoolSize + '\'' +
                ", connectionTimeout='" + connectionTimeout + '\'' +
                ", idleTimeout='" + idleTimeout + '\'' +
                '}';
    }

    public static class Builder {
        private String url;
        private String password;
        private String username;
        private String driverClassName;
        private String connectionPoolSize;
        private String connectionTimeout;
        private String idleTimeout;

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }
        public Builder setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
            return this;
        }
        public Builder setConnectionPoolSize(String connectionPoolSize) {
            this.connectionPoolSize = connectionPoolSize;
            return this;
        }
        public Builder setConnectionTimeout(String connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Builder setIdleTimeout(String idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public DatabaseConfig build() {
            return new DatabaseConfig(this);
        }
    }

}
