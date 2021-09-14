package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object cameras extends js.Object:
	@js.native
	class Camera extends js.Object:
		val matrixWorldInverse: Matrix4 = js.native;
		val projectionMatrix: Matrix4 = js.native;
		val projectionMatrixInverse: Matrix4 = js.native;
		var isCamera: true = js.native;
		def getWorldDirection(target: Vector3): Vector3 = js.native
		def updateMatrixWorld(force: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	@js.native
	class OrthographicCamera extends js.Object:
		val type: "OrthographicCamera" = js.native;
		var isOrthographicCamera: true = js.native;
		val zoom: Double = js.native;
		val view: null | objectType21 = js.native;
		val left: Double = js.native;
		val right: Double = js.native;
		val top: Double = js.native;
		val bottom: Double = js.native;
		val near: Double = js.native;
		val far: Double = js.native;
		def updateProjectionMatrix(): Unit = js.native
		def setViewOffset(fullWidth: Double, fullHeight: Double, offsetX: Double, offsetY: Double, width: Double, height: Double): Unit = js.native
		def clearViewOffset(): Unit = js.native
		def toJSON(meta: js.UndefOr[js.Any] = js.undefined): js.Any = js.native
	@js.native
	class PerspectiveCamera extends js.Object:
		val type: "PerspectiveCamera" = js.native;
		var isPerspectiveCamera: true = js.native;
		val zoom: Double = js.native;
		val fov: Double = js.native;
		val aspect: Double = js.native;
		val near: Double = js.native;
		val far: Double = js.native;
		val focus: Double = js.native;
		val view: null | objectType21 = js.native;
		val filmGauge: Double = js.native;
		val filmOffset: Double = js.native;
		def setFocalLength(focalLength: Double): Unit = js.native
		def getFocalLength(): Double = js.native
		def getEffectiveFOV(): Double = js.native
		def getFilmWidth(): Double = js.native
		def getFilmHeight(): Double = js.native
		def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
		def clearViewOffset(): Unit = js.native
		def updateProjectionMatrix(): Unit = js.native
		def toJSON(meta: js.UndefOr[js.Any] = js.undefined): js.Any = js.native
		def setLens(focalLength: Double, frameHeight: js.UndefOr[Double] = js.undefined): Unit = js.native
	@js.native
	class StereoCamera extends js.Object:
		val type: "StereoCamera" = js.native;
		val aspect: Double = js.native;
		val eyeSep: Double = js.native;
		val cameraL: PerspectiveCamera = js.native;
		val cameraR: PerspectiveCamera = js.native;
		def update(camera: PerspectiveCamera): Unit = js.native
	@js.native
	class ArrayCamera extends js.Object:
		val cameras: js.Array[PerspectiveCamera] = js.native;
		var isArrayCamera: true = js.native;
	@js.native
	class CubeCamera extends js.Object:
		val type: "CubeCamera" = js.native;
		val renderTarget: WebGLCubeRenderTarget = js.native;
		def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
