/**
 * CaseM client
 * Automatically generated client libraries for CaseM
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.otavanopisto.casem.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.casem.client.model.ContentClassification;
import fi.otavanopisto.casem.client.model.ContentFileLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Content
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-11T05:48:16.423+03:00")
public class Content   {
  @JsonProperty("odata.metadata")
  private String odataMetadata = null;

  @JsonProperty("ContentId")
  private Long contentId = null;

  @JsonProperty("Subject")
  private String subject = null;

  @JsonProperty("LanguageId")
  private Long languageId = null;

  @JsonProperty("PublicDate")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime publicDate = null;

  @JsonProperty("ExpiryDate")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime expiryDate = null;

  @JsonProperty("CreatedDate")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime createdDate = null;

  @JsonProperty("EditedDate")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime editedDate = null;

  @JsonProperty("TemplateId")
  private Long templateId = null;

  @JsonProperty("Version")
  private Long version = null;

  @JsonProperty("CreatorId")
  private Long creatorId = null;

  @JsonProperty("Editor")
  private Long editor = null;

  @JsonProperty("EventStartDate")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime eventStartDate = null;

  @JsonProperty("EventEndDate")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime eventEndDate = null;

  @JsonProperty("Classifications")
  private List<ContentClassification> classifications = new ArrayList<ContentClassification>();

  @JsonProperty("FileLinks")
  private List<ContentFileLink> fileLinks = new ArrayList<ContentFileLink>();

  public Content odataMetadata(String odataMetadata) {
    this.odataMetadata = odataMetadata;
    return this;
  }

   /**
   * Get odataMetadata
   * @return odataMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOdataMetadata() {
    return odataMetadata;
  }

  public void setOdataMetadata(String odataMetadata) {
    this.odataMetadata = odataMetadata;
  }

  public Content contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public Content subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Content languageId(Long languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Long languageId) {
    this.languageId = languageId;
  }

  public Content publicDate(LocalDateTime publicDate) {
    this.publicDate = publicDate;
    return this;
  }

   /**
   * Get publicDate
   * @return publicDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getPublicDate() {
    return publicDate;
  }

  public void setPublicDate(LocalDateTime publicDate) {
    this.publicDate = publicDate;
  }

  public Content expiryDate(LocalDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Content createdDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Content editedDate(LocalDateTime editedDate) {
    this.editedDate = editedDate;
    return this;
  }

   /**
   * Get editedDate
   * @return editedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getEditedDate() {
    return editedDate;
  }

  public void setEditedDate(LocalDateTime editedDate) {
    this.editedDate = editedDate;
  }

  public Content templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public Content version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public Content creatorId(Long creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * Get creatorId
   * @return creatorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
  }

  public Content editor(Long editor) {
    this.editor = editor;
    return this;
  }

   /**
   * Get editor
   * @return editor
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEditor() {
    return editor;
  }

  public void setEditor(Long editor) {
    this.editor = editor;
  }

  public Content eventStartDate(LocalDateTime eventStartDate) {
    this.eventStartDate = eventStartDate;
    return this;
  }

   /**
   * Get eventStartDate
   * @return eventStartDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getEventStartDate() {
    return eventStartDate;
  }

  public void setEventStartDate(LocalDateTime eventStartDate) {
    this.eventStartDate = eventStartDate;
  }

  public Content eventEndDate(LocalDateTime eventEndDate) {
    this.eventEndDate = eventEndDate;
    return this;
  }

   /**
   * Get eventEndDate
   * @return eventEndDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getEventEndDate() {
    return eventEndDate;
  }

  public void setEventEndDate(LocalDateTime eventEndDate) {
    this.eventEndDate = eventEndDate;
  }

  public Content classifications(List<ContentClassification> classifications) {
    this.classifications = classifications;
    return this;
  }

  public Content addClassificationsItem(ContentClassification classificationsItem) {
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Get classifications
   * @return classifications
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContentClassification> getClassifications() {
    return classifications;
  }

  public void setClassifications(List<ContentClassification> classifications) {
    this.classifications = classifications;
  }

  public Content fileLinks(List<ContentFileLink> fileLinks) {
    this.fileLinks = fileLinks;
    return this;
  }

  public Content addFileLinksItem(ContentFileLink fileLinksItem) {
    this.fileLinks.add(fileLinksItem);
    return this;
  }

   /**
   * Get fileLinks
   * @return fileLinks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContentFileLink> getFileLinks() {
    return fileLinks;
  }

  public void setFileLinks(List<ContentFileLink> fileLinks) {
    this.fileLinks = fileLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.odataMetadata, content.odataMetadata) &&
        Objects.equals(this.contentId, content.contentId) &&
        Objects.equals(this.subject, content.subject) &&
        Objects.equals(this.languageId, content.languageId) &&
        Objects.equals(this.publicDate, content.publicDate) &&
        Objects.equals(this.expiryDate, content.expiryDate) &&
        Objects.equals(this.createdDate, content.createdDate) &&
        Objects.equals(this.editedDate, content.editedDate) &&
        Objects.equals(this.templateId, content.templateId) &&
        Objects.equals(this.version, content.version) &&
        Objects.equals(this.creatorId, content.creatorId) &&
        Objects.equals(this.editor, content.editor) &&
        Objects.equals(this.eventStartDate, content.eventStartDate) &&
        Objects.equals(this.eventEndDate, content.eventEndDate) &&
        Objects.equals(this.classifications, content.classifications) &&
        Objects.equals(this.fileLinks, content.fileLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataMetadata, contentId, subject, languageId, publicDate, expiryDate, createdDate, editedDate, templateId, version, creatorId, editor, eventStartDate, eventEndDate, classifications, fileLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    odataMetadata: ").append(toIndentedString(odataMetadata)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    publicDate: ").append(toIndentedString(publicDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    editedDate: ").append(toIndentedString(editedDate)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    eventStartDate: ").append(toIndentedString(eventStartDate)).append("\n");
    sb.append("    eventEndDate: ").append(toIndentedString(eventEndDate)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
    sb.append("    fileLinks: ").append(toIndentedString(fileLinks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

