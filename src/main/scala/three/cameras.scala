package typings.three.three.cameras

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.Camera")
class Camera extends Object3D:
	var matrixWorldInverse: Matrix4 = js.native;
	var projectionMatrix: Matrix4 = js.native;
	var projectionMatrixInverse: Matrix4 = js.native;
	val isCamera: Boolean = js.native;



@js.native
@JSGlobal("THREE.OrthographicCamera")
class OrthographicCamera extends Camera:
	def this(left: Double, right: Double, top: Double, bottom: Double, near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()

	val isOrthographicCamera: Boolean = js.native;
	var zoom: Double = js.native;
	var view: Null | objectType14 = js.native;
	var left: Double = js.native;
	var right: Double = js.native;
	var top: Double = js.native;
	var bottom: Double = js.native;
	var near: Double = js.native;
	var far: Double = js.native;
	def updateProjectionMatrix(): Unit = js.native
	def setViewOffset(fullWidth: Double, fullHeight: Double, offsetX: Double, offsetY: Double, width: Double, height: Double): Unit = js.native
	def clearViewOffset(): Unit = js.native


@js.native
@JSGlobal("THREE.PerspectiveCamera")
class PerspectiveCamera extends Camera:
	def this(fov: js.UndefOr[Double], aspect: js.UndefOr[Double], near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()

	val isPerspectiveCamera: Boolean = js.native;
	var zoom: Double = js.native;
	var fov: Double = js.native;
	var aspect: Double = js.native;
	var near: Double = js.native;
	var far: Double = js.native;
	var focus: Double = js.native;
	var view: Null | objectType14 = js.native;
	var filmGauge: Double = js.native;
	var filmOffset: Double = js.native;
	def setFocalLength(focalLength: Double): Unit = js.native
	def getFocalLength(): Double = js.native
	def getEffectiveFOV(): Double = js.native
	def getFilmWidth(): Double = js.native
	def getFilmHeight(): Double = js.native
	def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
	def clearViewOffset(): Unit = js.native
	def updateProjectionMatrix(): Unit = js.native

	def setLens(focalLength: Double, frameHeight: js.UndefOr[Double]): Unit = js.native

@js.native
@JSGlobal("THREE.StereoCamera")
class StereoCamera extends Camera:

	var aspect: Double = js.native;
	var eyeSep: Double = js.native;
	var cameraL: PerspectiveCamera = js.native;
	var cameraR: PerspectiveCamera = js.native;
	def update(camera: PerspectiveCamera): Unit = js.native

@js.native
@JSGlobal("THREE.ArrayCamera")
class ArrayCamera extends PerspectiveCamera:
	def this(cameras: js.UndefOr[js.Array[PerspectiveCamera]]) = this()
	var cameras: js.Array[PerspectiveCamera] = js.native;
	val isArrayCamera: Boolean = js.native;

@js.native
@JSGlobal("THREE.CubeCamera")
class CubeCamera extends Object3D:
	def this(near: Double, far: Double, renderTarget: WebGLCubeRenderTarget) = this()

	var renderTarget: WebGLCubeRenderTarget = js.native;
	def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native

@js.native
sealed trait objectType14 extends js.Object:
	var enabled: Boolean = js.native;
	var fullWidth: Double = js.native;
	var fullHeight: Double = js.native;
	var offsetX: Double = js.native;
	var offsetY: Double = js.native;
	var width: Double = js.native;
	var height: Double = js.native;
