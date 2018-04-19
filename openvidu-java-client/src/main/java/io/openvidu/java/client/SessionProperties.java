package io.openvidu.java.client;

public class SessionProperties {

	private MediaMode mediaMode;
	private ArchiveMode archiveMode;
	private ArchiveLayout archiveLayout;
	private String customLayout;

	public static class Builder {

		private MediaMode mediaMode = MediaMode.ROUTED;
		private ArchiveMode archiveMode = ArchiveMode.MANUAL;
		private ArchiveLayout archiveLayout = ArchiveLayout.BEST_FIT;
		private String customLayout = "";

		public SessionProperties build() {
			return new SessionProperties(this.mediaMode, this.archiveMode, this.archiveLayout, this.customLayout);
		}

		public SessionProperties.Builder mediaMode(MediaMode mediaMode) {
			this.mediaMode = mediaMode;
			return this;
		}

		public SessionProperties.Builder archiveMode(ArchiveMode archiveMode) {
			this.archiveMode = archiveMode;
			return this;
		}

		public SessionProperties.Builder archiveLayout(ArchiveLayout archiveLayout) {
			this.archiveLayout = archiveLayout;
			return this;
		}

		public SessionProperties.Builder customLayout(String customLayout) {
			this.customLayout = customLayout;
			return this;
		}

	}

	protected SessionProperties() {
		this.mediaMode = MediaMode.ROUTED;
		this.archiveMode = ArchiveMode.MANUAL;
		this.archiveLayout = ArchiveLayout.BEST_FIT;
	}

	private SessionProperties(MediaMode mediaMode, ArchiveMode archiveMode, ArchiveLayout archiveLayout,
			String customLayout) {
		this.mediaMode = mediaMode;
		this.archiveMode = archiveMode;
		this.archiveLayout = archiveLayout;
		this.customLayout = customLayout;
	}

	public ArchiveMode archiveMode() {
		return this.archiveMode;
	}

	public MediaMode mediaMode() {
		return this.mediaMode;
	}

	public ArchiveLayout archiveLayout() {
		return this.archiveLayout;
	}

	public String customLayout() {
		return this.customLayout;
	}

}