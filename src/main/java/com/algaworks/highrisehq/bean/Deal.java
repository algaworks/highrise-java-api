/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author duncan
 */
@XmlRootElement(name="deal")
public class Deal implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
//  <account-id type="integer"></account-id>
    private String accountId;
//  <author-id type="integer"></author-id>
    private String background;
//  <background></background>
    private Long categoryId;
//  <category-id type="integer"></category-id>
//  <created-at type="datetime"></created-at>
//  <currency></currency>
//  <duration type="integer"></duration>
    private Long groupId;
//  <group-id type="integer"></group-id>
//  <name></name>
    private String name;
//  <owner-id type="integer"></owner-id>
//  <party-id type="integer"></party-id>
//  <price type="integer"></price>
//  <price-type></price-type>
//  <responsible-party-id type="integer"></responsible-party-id>
    private String status;
//  <status></status>
//  <status-changed-on type="date"></status-changed-on>
//  <updated-at type="datetime"></updated-at>
//  <visible-to>Everyone</visible-to>
//  <parties type="array">
//    <party>...</party>
//  </parties>
//  <party>...</party

    @XmlElement(name="account-id")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="background")
    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @XmlElement(name="category-id")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @XmlElement(name="group-id")
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @XmlElement(name="id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name="status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Deal{" + "id=" + id + ", accountId=" + accountId + ", background=" + background + ", categoryId=" + categoryId + ", groupId=" + groupId + ", name=" + name + ", status=" + status + '}';
    }

}
