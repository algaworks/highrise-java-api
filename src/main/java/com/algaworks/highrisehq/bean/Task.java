package com.algaworks.highrisehq.bean;

import com.algaworks.highrisehq.Highrise.SubjectType;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="task")
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static SimpleDateFormat ISO_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	
	static {
		ISO_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
	
	private Long id;
	private String body;
	private Long ownerId;
	private Long subjectId;
	private SubjectType subjectType;
	private String frame;
	private Long categoryId;
	private String dueAt;
	private boolean _public;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement(name="subject-id")
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	
	@XmlElement(name="subject-type")
	public SubjectType getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(SubjectType subjectType) {
		this.subjectType = subjectType;
	}
	
	@XmlElement(name="category-id")
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	
	@XmlElement(name="due-at")
	public String getDueAt() {
		return dueAt;
	}
	public void setDueAt(String dueAt) {
		this.dueAt = dueAt;
	}
	
	public void setDueAt(Date dueAt) {
		this.setDueAt(ISO_DATE_FORMAT.format(dueAt));
	}
	
	@XmlElement(name="public")
	public boolean isPublic() {
		return _public;
	}
	public void setPublic(boolean _public) {
		this._public = _public;
	}
	
	public String getFrame() {
		return frame;
	}
	public void setFrame(String frame) {
		this.frame = frame;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@XmlElement(name="owner-id")
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}