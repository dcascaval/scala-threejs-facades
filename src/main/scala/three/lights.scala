package typings.three.three.lights

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
import typings.three.three.cameras.*
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


@js.native
@JSGlobal("THREE.HemisphereLightProbe")
class HemisphereLightProbe extends LightProbe:
	def this(skyColor: js.UndefOr[ColorRepresentation], groundColor: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double]) = this()
	var isHemisphereLightProbe: Boolean = js.native;

@js.native
@JSGlobal("THREE.DirectionalLight")
class DirectionalLight extends Light:
	def this(color: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val position: Vector3 = js.native;
	val target: Object3D = js.native;
	val intensity: Double = js.native;
	val shadow: DirectionalLightShadow = js.native;
	var isDirectionalLight: Boolean = js.native;

@js.native
@JSGlobal("THREE.PointLightShadow")
class PointLightShadow extends LightShadow:
	val camera: PerspectiveCamera = js.native;

@js.native
@JSGlobal("THREE.SpotLightShadow")
class SpotLightShadow extends LightShadow:
	val camera: PerspectiveCamera = js.native;
	var isSpotLightShadow: Boolean = js.native;
	val focus: Double = js.native;

@js.native
@JSGlobal("THREE.SpotLight")
class SpotLight extends Light:
	def this(color: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double], distance: js.UndefOr[Double], angle: js.UndefOr[Double], penumbra: js.UndefOr[Double], decay: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val position: Vector3 = js.native;
	val target: Object3D = js.native;
	val intensity: Double = js.native;
	val distance: Double = js.native;
	val angle: Double = js.native;
	val decay: Double = js.native;
	val shadow: SpotLightShadow = js.native;
	val power: Double = js.native;
	val penumbra: Double = js.native;
	var isSpotLight: Boolean = js.native;

@js.native
@JSGlobal("THREE.AmbientLightProbe")
class AmbientLightProbe extends LightProbe:
	def this(color: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double]) = this()
	var isAmbientLightProbe: Boolean = js.native;

@js.native
@JSGlobal("THREE.LightShadow")
class LightShadow extends js.Object:
	def this(camera: Camera) = this()
	val camera: Camera = js.native;
	val bias: Double = js.native;
	val normalBias: Double = js.native;
	val radius: Double = js.native;
	val mapSize: Vector2 = js.native;
	val map: RenderTarget = js.native;
	val mapPass: RenderTarget = js.native;
	val matrix: Matrix4 = js.native;
	val autoUpdate: Boolean = js.native;
	val needsUpdate: Boolean = js.native;
	def copy(source: LightShadow): this.type = js.native
	def clone(recursive: js.UndefOr[Boolean]): this.type = js.native
	def toJSON(): js.Any = js.native
	def getFrustum(): Double = js.native
	def updateMatrices(light: Light, viewportIndex: js.UndefOr[Double]): Unit = js.native
	def getViewport(viewportIndex: Double): Vector4 = js.native
	def getFrameExtents(): Vector2 = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.AmbientLight")
class AmbientLight extends Light:
	def this(color: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	var isAmbientLight: Boolean = js.native;

@js.native
@JSGlobal("THREE.DirectionalLightShadow")
class DirectionalLightShadow extends LightShadow:
	val camera: OrthographicCamera = js.native;
	var isDirectionalLightShadow: Boolean = js.native;

@js.native
@JSGlobal("THREE.HemisphereLight")
class HemisphereLight extends Light:
	def this(skyColor: js.UndefOr[ColorRepresentation], groundColor: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val position: Vector3 = js.native;
	val groundColor: Color = js.native;
	var isHemisphereLight: Boolean = js.native;

@js.native
@JSGlobal("THREE.LightProbe")
class LightProbe extends Light:
	def this(sh: js.UndefOr[SphericalHarmonics3], intensity: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	var isLightProbe: Boolean = js.native;
	val sh: SphericalHarmonics3 = js.native;
	def fromJSON(json: js.Object): LightProbe = js.native

@js.native
@JSGlobal("THREE.PointLight")
class PointLight extends Light:
	def this(color: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double], distance: js.UndefOr[Double], decay: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val intensity: Double = js.native;
	val distance: Double = js.native;
	val decay: Double = js.native;
	val shadow: PointLightShadow = js.native;
	val power: Double = js.native;

@js.native
@JSGlobal("THREE.Light")
class Light extends Object3D:
	def this(hex: js.UndefOr[Double | String], intensity: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val intensity: Double = js.native;
	var isLight: Boolean = js.native;
	val shadow: LightShadow = js.native;
	val shadowCameraFov: js.Any = js.native;
	val shadowCameraLeft: js.Any = js.native;
	val shadowCameraRight: js.Any = js.native;
	val shadowCameraTop: js.Any = js.native;
	val shadowCameraBottom: js.Any = js.native;
	val shadowCameraNear: js.Any = js.native;
	val shadowCameraFar: js.Any = js.native;
	val shadowBias: js.Any = js.native;
	val shadowMapWidth: js.Any = js.native;
	val shadowMapHeight: js.Any = js.native;
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.RectAreaLight")
class RectAreaLight extends Light:
	def this(color: js.UndefOr[ColorRepresentation], intensity: js.UndefOr[Double], width: js.UndefOr[Double], height: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val width: Double = js.native;
	val height: Double = js.native;
	val intensity: Double = js.native;
	var isRectAreaLight: Boolean = js.native;
