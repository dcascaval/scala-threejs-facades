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
	val matrixWorldInverse: Matrix4 = js.native;
	val projectionMatrix: Matrix4 = js.native;
	val projectionMatrixInverse: Matrix4 = js.native;
	var isCamera: Boolean = js.native;
	def getWorldDirection(target: Vector3): Vector3 = js.native
	def updateMatrixWorld(force: js.UndefOr[Boolean]): Unit = js.native

@js.native
@JSGlobal("THREE.OrthographicCamera")
class OrthographicCamera extends Camera:
	def this(left: Double, right: Double, top: Double, bottom: Double, near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	var isOrthographicCamera: Boolean = js.native;
	val zoom: Double = js.native;
	val view: Null | objectType15 = js.native;
	val left: Double = js.native;
	val right: Double = js.native;
	val top: Double = js.native;
	val bottom: Double = js.native;
	val near: Double = js.native;
	val far: Double = js.native;
	def updateProjectionMatrix(): Unit = js.native
	def setViewOffset(fullWidth: Double, fullHeight: Double, offsetX: Double, offsetY: Double, width: Double, height: Double): Unit = js.native
	def clearViewOffset(): Unit = js.native
	def toJSON(meta: js.UndefOr[js.Any]): js.Any = js.native

@js.native
@JSGlobal("THREE.PerspectiveCamera")
class PerspectiveCamera extends Camera:
	def this(fov: js.UndefOr[Double], aspect: js.UndefOr[Double], near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	var isPerspectiveCamera: Boolean = js.native;
	val zoom: Double = js.native;
	val fov: Double = js.native;
	val aspect: Double = js.native;
	val near: Double = js.native;
	val far: Double = js.native;
	val focus: Double = js.native;
	val view: Null | objectType15 = js.native;
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
	def toJSON(meta: js.UndefOr[js.Any]): js.Any = js.native
	def setLens(focalLength: Double, frameHeight: js.UndefOr[Double]): Unit = js.native

@js.native
@JSGlobal("THREE.StereoCamera")
class StereoCamera extends Camera:
	val `type`: String = js.native;
	val aspect: Double = js.native;
	val eyeSep: Double = js.native;
	val cameraL: PerspectiveCamera = js.native;
	val cameraR: PerspectiveCamera = js.native;
	def update(camera: PerspectiveCamera): Unit = js.native

@js.native
@JSGlobal("THREE.ArrayCamera")
class ArrayCamera extends PerspectiveCamera:
	def this(cameras: js.UndefOr[js.Array[PerspectiveCamera]]) = this()
	val cameras: js.Array[PerspectiveCamera] = js.native;
	var isArrayCamera: Boolean = js.native;

@js.native
@JSGlobal("THREE.CubeCamera")
class CubeCamera extends Object3D:
	def this(near: Double, far: Double, renderTarget: WebGLCubeRenderTarget) = this()
	val `type`: String = js.native;
	val renderTarget: WebGLCubeRenderTarget = js.native;
	def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native

@js.native
sealed trait objectType15 extends js.Object:
	val enabled: Boolean = js.native;
	val fullWidth: Double = js.native;
	val fullHeight: Double = js.native;
	val offsetX: Double = js.native;
	val offsetY: Double = js.native;
	val width: Double = js.native;
	val height: Double = js.native;
