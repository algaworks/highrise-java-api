package com.algaworks.highrisehq.bean;

import com.algaworks.highrisehq.Highrise.SubjectType;
import java.io.Serializable;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="note")
public class Note implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String body;
	private Long subjectId;
	private SubjectType subjectType;
        private Long collectionId;
        private SubjectType collectionType;
        private Date createdate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
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

    @XmlElement(name="collection-id")
    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    @XmlElement(name="collection-type")
    public SubjectType getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(SubjectType collectionType) {
        this.collectionType = collectionType;
    }

    @XmlElement(name="created-at")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
		Note other = (Note) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", body=" + body + ", subjectId=" + subjectId + ", subjectType=" + subjectType + '}';
    }
	
}