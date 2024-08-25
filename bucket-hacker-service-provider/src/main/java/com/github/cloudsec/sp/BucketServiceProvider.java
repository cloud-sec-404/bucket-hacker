package com.github.cloudsec.sp;

import com.github.cloudsec.exception.BucketHackerException;

import java.util.List;

/**
 * 用于表示一个存储桶服务商的功能定义
 *
 * @author CC11001100
 */
public interface BucketServiceProvider {

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 判断存储桶是否存在
     *
     * @param bucketName 要判断的存储桶的名字
     * @return
     * @throws BucketHackerException
     */
    boolean isBucketExists(String bucketName) throws BucketHackerException;

    /**
     * 创建存储桶
     *
     * @param bucketName 要创建的存储桶的名字
     * @return
     * @throws BucketHackerException
     */
    boolean createBucket(String bucketName) throws BucketHackerException;

    /**
     * 删除存储桶
     *
     * @param bucketName 要删除的存储桶的名字
     * @return
     * @throws BucketHackerException
     */
    boolean deleteBucket(String bucketName) throws BucketHackerException;

    /**
     * 列出账号下所有的存储桶
     *
     * @param accessKey
     * @param secretKey
     * @return
     * @throws BucketHackerException
     */
    List<String> listBuckets(String accessKey, String secretKey) throws BucketHackerException;

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 获取存储桶上设置的acl
     *
     * @param bucketName
     * @return
     * @throws BucketHackerException
     */
    String getBucketAcl(String bucketName) throws BucketHackerException;

    String putBucketAcl(String bucketName, String bucketAcl) throws BucketHackerException;

    // -----------------------------------------------------------------------------------------------------------------

    Object getObject(String bucketName, String objectName, byte[] objectBytes) throws BucketHackerException;

    boolean putObject(String bucketName, String objectName, byte[] objectBytes) throws BucketHackerException;

    List<Object> listObjects(String bucketName, String objectName) throws BucketHackerException;

    // -----------------------------------------------------------------------------------------------------------------

    String getBucketPolicy(String bucketName) throws BucketHackerException;

    boolean putBucketPolicy(String bucketName, String bucketPolicy) throws BucketHackerException;

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 获取对象的acl
     *
     * @param bucketName
     * @param objectName
     * @return
     * @throws BucketHackerException
     */
    String getObjectAcl(String bucketName, String objectName) throws BucketHackerException;

    /**
     * 修改对象的acl
     *
     * @param bucketName
     * @param objectName
     * @param aclPolicy
     * @return
     * @throws BucketHackerException
     */
    String putObjectAcl(String bucketName, String objectName, String aclPolicy) throws BucketHackerException;

    // -----------------------------------------------------------------------------------------------------------------


}
