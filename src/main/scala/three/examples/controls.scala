package typings.three.examples.controls

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*
import typings.three.*
import typings.three.examples.*


@js.native
@JSGlobal("THREE.OrbitControls")
class OrbitControls extends js.Object:
	def this(`object`: Camera, domElement: js.UndefOr[HTMLElement] = js.undefined) = this()
	var `object`: Camera = js.native
	var domElement: HTMLElement | HTMLDocument = js.native
	var enabled: Boolean = js.native
	var target: Vector3 = js.native
	var center: Vector3 = js.native
	var minDistance: Double = js.native
	var maxDistance: Double = js.native
	var minZoom: Double = js.native
	var maxZoom: Double = js.native
	var minPolarAngle: Double = js.native
	var maxPolarAngle: Double = js.native
	var minAzimuthAngle: Double = js.native
	var maxAzimuthAngle: Double = js.native
	var enableDamping: Boolean = js.native
	var dampingFactor: Double = js.native
	var enableZoom: Boolean = js.native
	var zoomSpeed: Double = js.native
	var enableRotate: Boolean = js.native
	var rotateSpeed: Double = js.native
	var enablePan: Boolean = js.native
	var panSpeed: Double = js.native
	var screenSpacePanning: Boolean = js.native
	var keyPanSpeed: Double = js.native
	var autoRotate: Boolean = js.native
	var autoRotateSpeed: Double = js.native
	var enableKeys: Boolean = js.native
	var keys: AnonObject1 = js.native
	var mouseButtons: AnonObject2 = js.native
	var touches: AnonObject3 = js.native
	def update(): Boolean = js.native
	def listenToKeyEvents(domElement: HTMLElement): Unit = js.native
	def saveState(): Unit = js.native
	def reset(): Unit = js.native
	def dispose(): Unit = js.native
	def getPolarAngle(): Double = js.native
	def getAzimuthalAngle(): Double = js.native
	def getDistance(): Double = js.native
	def addEventListener(`type`: String, listener: js.Function1[js.Any,Unit]): Unit = js.native
	def hasEventListener(`type`: String, listener: js.Function1[js.Any,Unit]): Boolean = js.native
	def removeEventListener(`type`: String, listener: js.Function1[js.Any,Unit]): Unit = js.native
	def dispatchEvent(event: AnonObject4): Unit = js.native

@js.native
@JSGlobal("THREE.MapControls")
class MapControls extends OrbitControls:
	def this(`object`: Camera, domElement: js.UndefOr[HTMLElement] = js.undefined) = this()

@js.native
trait AnonObject3 extends js.Object:
	var ONE: TOUCH = js.native
	var TWO: TOUCH = js.native

@js.native
trait AnonObject4 extends js.Object:
	var `type`: String = js.native
	var target: js.Any = js.native

@js.native
trait AnonObject1 extends js.Object:
	var LEFT: String = js.native
	var UP: String = js.native
	var RIGHT: String = js.native
	var BOTTOM: String = js.native

@js.native
trait AnonObject2 extends js.Object:
	var LEFT: MOUSE = js.native
	var MIDDLE: MOUSE = js.native
	var RIGHT: MOUSE = js.native
