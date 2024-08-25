package com.github.cloudsec.sp;

/**
 * 
 * @author CC11001100
 */
public enum ObjectAcl {

    PUBLIC_READ_WRITE,

    PUBLIC_READ,

    PRIVATE,

    /**
     * 继承bucket的acl
     */
    DEFAULT;

}
