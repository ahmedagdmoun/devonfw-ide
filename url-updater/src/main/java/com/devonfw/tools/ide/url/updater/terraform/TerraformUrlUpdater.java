package com.devonfw.tools.ide.url.updater.terraform;

import com.devonfw.tools.ide.url.model.folder.UrlVersion;
import com.devonfw.tools.ide.url.updater.GithubUrlUpdater;

/**
 * {@link GithubUrlUpdater} for terraform.
 */
public class TerraformUrlUpdater extends GithubUrlUpdater {
  @Override
  protected String getTool() {

    return "terraform";
  }

  @Override
  protected String getGithubOrganization() {

    return "hashicorp";
  }

  @Override
  protected String getVersionPrefixToRemove() {

    return "v";
  }

  @Override
  protected void addVersion(UrlVersion urlVersion) {

    String baseUrl = "https://releases.hashicorp.com/terraform/${version}/terraform_${version}_";
    doAddVersion(urlVersion, baseUrl + "windows_amd64.zip", WINDOWS);
    doAddVersion(urlVersion, baseUrl + "linux_amd64.zip", LINUX);
    doAddVersion(urlVersion, baseUrl + "darwin_amd64.zip", MAC);
    doAddVersion(urlVersion, baseUrl + "darwin_arm64.zip", MAC, ARM64);
  }

}
