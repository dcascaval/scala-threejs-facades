package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object textures extends js.Object:
	@js.native
	class CubeTexture extends js.Object:
		val images: js.Any = js.native;
		val flipY: Boolean = js.native;
		var isCubeTexture: true = js.native;
	@js.native
	class CompressedTexture extends js.Object:
		val image: objectType48 = js.native;
		val mipmaps: js.Array[ImageData] = js.native;
		val flipY: Boolean = js.native;
		val generateMipmaps: Boolean = js.native;
		var isCompressedTexture: true = js.native;
	@js.native
	class DataTexture2DArray extends js.Object:
		val magFilter: TextureFilter = js.native;
		val minFilter: TextureFilter = js.native;
		val wrapR: Boolean = js.native;
		val flipY: Boolean = js.native;
		val generateMipmaps: Boolean = js.native;
		var isDataTexture2DArray: true = js.native;
	@js.native
	class CanvasTexture extends js.Object:
		var isCanvasTexture: true = js.native;
	@js.native
	class DataTexture extends js.Object:
		val image: ImageData = js.native;
		val flipY: Boolean = js.native;
		val generateMipmaps: Boolean = js.native;
		val unpackAlignment: Double = js.native;
		val format: PixelFormat = js.native;
		var isDataTexture: true = js.native;
	@js.native
	class VideoTexture extends js.Object:
		var isVideoTexture: true = js.native;
		val generateMipmaps: Boolean = js.native;
	@js.native
	class Texture extends js.Object:
		val id: Double = js.native;
		val uuid: String = js.native;
		val name: String = js.native;
		val sourceFile: String = js.native;
		val image: js.Any = js.native;
		val mipmaps: js.Array[js.Any] = js.native;
		val mapping: Mapping = js.native;
		val wrapS: Wrapping = js.native;
		val wrapT: Wrapping = js.native;
		val magFilter: TextureFilter = js.native;
		val minFilter: TextureFilter = js.native;
		val anisotropy: Double = js.native;
		val format: PixelFormat = js.native;
		val internalFormat: PixelFormatGPU | null = js.native;
		val type: TextureDataType = js.native;
		val matrix: Matrix3 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		val offset: Vector2 = js.native;
		val repeat: Vector2 = js.native;
		val center: Vector2 = js.native;
		val rotation: Double = js.native;
		val generateMipmaps: Boolean = js.native;
		val premultiplyAlpha: Boolean = js.native;
		val flipY: Boolean = js.native;
		val unpackAlignment: Double = js.native;
		val encoding: TextureEncoding = js.native;
		val isRenderTargetTexture: Boolean = js.native;
		val version: Double = js.native;
		val needsUpdate: Boolean = js.native;
		var isTexture: true = js.native;
		val onUpdate: js.Function0[,Unit] = js.native;


		def clone(): this.type = js.native
		def copy(source: Texture): this.type = js.native
		def toJSON(meta: js.Any): js.Any = js.native
		def dispose(): Unit = js.native
		def transformUv(uv: Vector2): Vector2 = js.native
		def updateMatrix(): Unit = js.native
	@js.native
	class DepthTexture extends js.Object:
		val image: objectType48 = js.native;
		val flipY: Boolean = js.native;
		val generateMipmaps: Boolean = js.native;
		var isDepthTexture: true = js.native;
	@js.native
	class DataTexture3D extends js.Object:
		val magFilter: TextureFilter = js.native;
		val minFilter: TextureFilter = js.native;
		val wrapR: Boolean = js.native;
		val flipY: Boolean = js.native;
		val generateMipmaps: Boolean = js.native;
		var isDataTexture3D: true = js.native;
