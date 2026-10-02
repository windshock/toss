// entry=0xfb95c

void Hfb93c(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  undefined4 uVar2;
  int iVar3;
  char *pcVar4;
  char *pcVar5;
  ulong uVar6;
  char *pcVar7;
  long unaff_x20;
  uint unaff_w24;
  long unaff_x29;
  
  do {
    unaff_w24 = (unaff_w24 ^ 1) + (unaff_w24 & 1) * 2;
    param_1 = *(long *)(param_1 + 0x68);
  } while (param_1 != 0);
  *(BADSPACEBASE **)(unaff_x29 + -0x88) = register0x00000008;
  *(ulong *)(unaff_x29 + -0x98) = (ulong)unaff_w24;
  *(ulong *)(unaff_x29 + -0x90) =
       (long)&stack0x00000000 - ((ulong)unaff_w24 * 4 + 0xf & 0x7fffffff0);
  pcVar4 = *(char **)(unaff_x20 + 0x20);
  pcVar5 = pcVar4;
  for (; *pcVar4 != '\0';
      pcVar4 = pcVar4 + (-DAT_00280f50 ^ 0xe5eb2050b52367f2U) +
                        (-DAT_00280f50 & 0xe5eb2050b52367f2U) * 2) {
    pcVar7 = pcVar4;
    if (*pcVar4 != '/') {
      pcVar7 = pcVar5;
    }
    pcVar5 = pcVar7;
  }
  uVar6 = -(long)(pcVar5 + 1);
  iVar3 = (int)DAT_00280f50;
  uVar2 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar3 | 0xb52367f1U) * 2 - (-iVar3 ^ 0xb52367f1U)) * 300 +
                     (long)(int)((-iVar3 ^ 0xb5236848U) + (-iVar3 & 0xb5236848U) * 2)])
                    ((-iVar3 ^ 0xb52367f3U) + (-iVar3 & 0xb52367f3U) * 2,param_3,pcVar5 + 1,0xfc1115
                     ,((ulong)pcVar4 | uVar6) + ((ulong)pcVar4 & uVar6));
  **(undefined4 **)(unaff_x29 + -0x90) = uVar2;
  ppuVar1 = &PTR_LAB_00274828;
  if (*(long *)(unaff_x20 + 0x68) != 0) {
    ppuVar1 = &PTR_LAB_00277e30;
  }
                    /* WARNING: Could not recover jumptable at 0x001fbfbc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


