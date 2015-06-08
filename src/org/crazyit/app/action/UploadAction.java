package org.crazyit.app.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		 HttpServletRequest request = ServletActionContext.getRequest ();
		// String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	// System.out.println(path);
		return ServletActionContext.getRequest().getRealPath(savePath);
		
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(getSavePath());
		FileOutputStream fos = new FileOutputStream(getSavePath()+"\\"+getUploadFileName());
	 
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len=fis.read(buffer))>0){
			fos.write(buffer,0,len);
		}
		System.out.println("return success");
		return SUCCESS;
	}

	

}
