// entry=0xf45f8

void Hf4584(void)

{
  undefined **ppuVar1;
  long lVar2;
  void *unaff_x26;
  
  DAT_00286308 = (-(int)DAT_00285dc0 | 0xb5830cfcU) * 2 - (-(int)DAT_00285dc0 ^ 0xb5830cfcU);
  memset(unaff_x26,0,0x810);
  lVar2 = (-DAT_00285dc0 | 0x94d41c6bb5830c98U) * 2 - (-DAT_00285dc0 ^ 0x94d41c6bb5830c98U);
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_00275680 +
            (long)(int)((-(int)DAT_00285dc0 | 0xb5830cfcU) + (-(int)DAT_00285dc0 & 0xb5830cfcU)) *
            0x57;
  if ((ulong)((lVar2 << ((-DAT_00285dc0 | 0xd1cU) + (-DAT_00285dc0 & 0xd1cU) & 0x3f)) >> 0x20) <=
      0x94d41c6bb582fcfb - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) {
    ppuVar1 = &PTR_LAB_0027f030;
  }
                    /* WARNING: Could not recover jumptable at 0x001f7968. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(lVar2,&DAT_0027be9c,0,
                      (-DAT_00285dc0 | 0x94d41c6bb5830cfcU) * 2 -
                      (-DAT_00285dc0 ^ 0x94d41c6bb5830cfcU));
  return;
}


